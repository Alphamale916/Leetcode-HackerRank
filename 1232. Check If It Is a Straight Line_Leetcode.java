class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length < 2) {
            return true;
        }
        
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];
        
        for (int i = 2; i < coordinates.length; i++) {
            int x2 = coordinates[i][0];
            int y2 = coordinates[i][1];
            
            int dx1 = x1 - x0;
            int dy1 = y1 - y0;
            int dx2 = x2 - x0;
            int dy2 = y2 - y0;
            
            if (dx1 * dy2 != dy1 * dx2) {
                return false;
            }
        }
        
        return true;
    }
}
