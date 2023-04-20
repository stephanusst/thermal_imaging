import ij.*;
import ij.process.*;
import ij.gui.*;
import java.awt.*;
import ij.plugin.*;

public class StephPaha implements PlugIn {

    public void run(String arg) {
       ImagePlus imp = IJ.openImage("C:/Users/INTEL-NUC/fiji-win64/Fiji.app/plugins/Workspace/Thermal/thermal_imaging/20230222-123001-458.out.jpg");
        IJ.setTool("polygon");
        int[] xpoints = {552,552,510,170,201,292,346,372,438,467,490,510,551};
        int[] ypoints = {476,495,516,518,352,126,62,59,89,144,317,377,461};
      //  imp.setRoi(new PolygonRoi(xpoints,ypoints,13,Roi.POLYGON));
      //  IJ.run(imp, "Find Maxima...", "prominence=7 strict exclude output=[Maxima Within Tolerance]");
    }

}
