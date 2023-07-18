class Solution {
    public int[] solution(String[] wallpaper) {
        int xmin = wallpaper[0].length();
        int xmax = 0;
        int ymin = wallpaper.length;
        int ymax = 0;

        for(int i=0; i<wallpaper.length; i++){
            if(wallpaper[i].contains("#")){
                if(i < ymin){
                    ymin = i;
                }
                if(i > ymax){
                    ymax = i;
                }
                int idx = wallpaper[i].indexOf("#");
                int lidx = wallpaper[i].lastIndexOf("#");
                if(idx < xmin){
                    xmin = idx;
                }
                if(lidx > xmax){
                    xmax = lidx;
                }
            }
        }
        int[] answer = {ymin, xmin, ymax+1, xmax+1};
        return answer;
    }
}