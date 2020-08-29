class Main{
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        int i=0;
        while(i<moves.length()){
            char ch = moves.charAt(i);
            switch(ch){
                case 'R': x+=1;break;
                case 'L': x-=1;break;
                case 'U': y+=1;break;
                case 'D': y-=1;break;
            }
            i++;
        }
        return x==0&&y==0;
    }
}