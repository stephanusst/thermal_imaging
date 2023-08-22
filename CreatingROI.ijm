selectWindow("20230222-123001-458.out.jpg");

run("16-bit");
setAutoThreshold("Mean dark");

run("Create Selection");
roiManager("Add");

run("Duplicate...", "duplicate");
selectWindow("20230222-123001-458.out-1.jpg");

roiManager("Select", 0);
ukuran=6;
run("Find Maxima...", "prominence=ukuran exclude output=[Point Selection]");


