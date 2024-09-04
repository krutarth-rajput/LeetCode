class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0, y = 0; 
        int direction = 0; 
        int maxDist = 0; 

        HashSet<String> obstacleSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            obstacleSet.add(obstacle[0] + "," + obstacle[1]);
        }

        for (int command : commands) {
            if (command == -1) {
                direction = (direction + 1) % 4;
            } else if (command == -2) {
                direction = (direction + 3) % 4;
            } else {
                int dx = 0, dy = 0;
                if (direction == 0) dy = 1;   
                if (direction == 1) dx = 1;   
                if (direction == 2) dy = -1; 
                if (direction == 3) dx = -1; 
                for (int i = 0; i < command; i++) {
                    int newX = x + dx;
                    int newY = y + dy;
                    if (!obstacleSet.contains(newX + "," + newY)) {
                        x = newX;
                        y = newY;
                        maxDist = Math.max(maxDist, x * x + y * y);
                    } else {
                        break;
                    }
                }
            }
        }

        return maxDist;
    }
}
