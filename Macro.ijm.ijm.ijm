open("C:/Users/INTEL-NUC/fiji-win64/Fiji.app/plugins/Workspace/Thermal/thermal_imaging/20230222-123001-458.out.jpg");
run("16-bit");
run("Robust Automatic Threshold Selection", "noise=25 lambda=3 min=104 verbose");
run("Create Selection");
selectWindow("20230222-123001-458.out.jpg");
run("Image to Selection...", "image=20230222-123001-458.out-mask opacity=100");
