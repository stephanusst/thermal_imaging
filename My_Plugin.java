import ij.*;
import ij.process.*;
import ij.gui.*;
import java.awt.*;
import ij.plugin.*;

public class My_Plugin implements PlugIn {

    public void run(String arg) {
        ImagePlus imp = IJ.openImage("C:/Users/INTEL-NUC/fiji-win64/Fiji.app/plugins/Workspace/Thermal/thermal_imaging/20230222-123001-458.out.jpg");
    }

}
