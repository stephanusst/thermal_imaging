makeOval(276, 103, 197, 212);
p=6
run("Find Maxima...", "prominence=p output=[Point Selection]");
run("Robust Automatic Threshold Selection", "noise=25 lambda=3 min=104 verbose");
