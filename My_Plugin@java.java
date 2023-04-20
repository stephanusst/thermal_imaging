import ij.*;
import ij.process.*;
import ij.gui.*;
import java.awt.*;
import ij.plugin.*;

public class My_Plugin implements PlugIn {

    public void run(String arg) {
        ImagePlus imp = IJ.getImage();
        int[] xpoints = {176,239,314,354,430,492,536,503};
        int[] ypoints = {503,252,106,65,103,368,467,502};
        imp.setRoi(new PolygonRoi(xpoints,ypoints,8,Roi.POLYGON));
        //IJ.setTool("freehand");
        ImagePlus imp = imp.duplicate();
        //IJ.setTool("polygon");
        IJ.run(imp, "Find Maxima...", "");
        int[] xpoints = {176,197,248,296,353,419,456,477,496,541,551};
        int[] ypoints = {513,357,229,119,60,80,124,260,363,451,500};
        imp.setRoi(new PolygonRoi(xpoints,ypoints,11,Roi.POLYGON));
        int[] xpoints = {395,345,295};
        int[] ypoints = {500,336,374};
        imp.setRoi(new PointRoi(xpoints,ypoints,3));
        IJ.run(imp, "Find Maxima...", "prominence=7 strict exclude output=[Single Points]");
        imp.close();
        imp.close();
        imp.close();
        IJ.run("script:C:\Users\INTEL-NUC\fiji-win64\Fiji.app\plugins\Workspace\Thermal\thermal_imaging\Steph_Paha.java", "");
        IJ.run(imp, "script:C:\Users\INTEL-NUC\fiji-win64\Fiji.app\plugins\Workspace\Thermal\thermal_imaging\Steph_Paha.java", "");
    }

}
