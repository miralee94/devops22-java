package examples;

class PathSplitter {
    
    public static String[] splitPath(String path) {
        int lastPoint = path.lastIndexOf(".");
        int lastSlash = path.lastIndexOf("/\\");
        int lastBackSlash = path.lastIndexOf("\\");
        int slashPos = -1;
        if (lastSlash > 0) {
            slashPos = lastSlash;
        } else if (lastBackSlash > 0) {
            slashPos = lastBackSlash;
        } else {
            slashPos = 0;
        }
        String firstPath = path.substring(0, slashPos);
        String fileName = path.substring(slashPos+1, lastPoint);
        String ext = path.substring(lastPoint+1);
        return new String[] {firstPath, fileName, ext};
    }

}