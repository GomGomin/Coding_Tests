import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        boolean[][] point = new boolean[park.length][park[0].length()];
        
        int[] location = new int[2];
        
        for(int i= 0; i<park.length; i++){
            for(int j=0; j<park[i].length(); j++){
                if(park[i].charAt(j) == 'S'){
                    location[0] = i;
                    location[1] = j;
                }else if(park[i].charAt(j) == 'X'){
                    point[i][j] = true;
                }
            }
        }
        
        for(int i=0; i<routes.length; i++){
            location = move(routes[i],location,point);
        }
        
        return location;
    }
    
    public int[] move(String routes,int[] location, boolean[][] park){
        int[] start = location.clone();
        int distance = Integer.parseInt(routes.substring(2));
        
        int xmax = park[0].length-1;
        int ymax = park.length-1;
        
        switch(routes.charAt(0)){
            case 'E' :
                if(start[1] + distance > xmax){
                    return location;
                }
                for(int i=0; i<distance; i++){
                    if(park[start[0]][start[1]]){
                        return location;
                    }else{
                        start[1]++;
                    }
                }
                break;
            case 'W' :
                if(start[1] - distance < 0){
                    return location;
                }
                for(int i=0; i<distance; i++){
                    if(park[start[0]][start[1]]){
                        return location;
                    }else{
                        start[1]--;
                    }
                }
                break;
            case 'S' :
                if(start[0] + distance > ymax){
                    return location;
                }
                for(int i=0; i<distance; i++){
                    if(park[start[0]][start[1]]){
                        return location;
                    }else{
                        start[0]++;
                    }
                }
                break;
            case 'N' :
                if(start[0] - distance < 0){
                    return location;
                }
                for(int i=0; i<distance; i++){
                    if(park[start[0]][start[1]]){
                        return location;
                    }else{
                        start[0]--;
                    }
                }
                break;
        }
        
        if(park[start[0]][start[1]]){
            return location;
        }else{
            return start;
        }
    }
}