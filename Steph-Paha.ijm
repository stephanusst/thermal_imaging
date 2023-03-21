open("C:/Program Files (x86)/Dianyang/Infrared Thermal Imaging Analysis/Picture/20230222/20230222-123001-458.out.jpg");
run("Duplicate...", " ");
selectWindow("20230222-123001-458.out.jpg");
//setTool("polygon");
makePolygon(322,83,432,86,476,208,496,340,556,484,500,500,167,500,207,319,282,153,294,120);

prominence=6;
output="Point Selection";
run("Find Maxima...", "prominence="+prominence+" exclude output=["+output+"]");

selectWindow("20230222-123001-458.out-1.jpg");
makePolygon(322,83,432,86,476,208,496,340,556,484,500,500,167,500,207,319,282,153,294,120);
output="Count"
//run("Find Maxima...", "prominence=6 exclude output=Count");
run("Find Maxima...", "prominence="+prominence+" exclude output="+output);

run("Tile");
selectWindow("Results");
