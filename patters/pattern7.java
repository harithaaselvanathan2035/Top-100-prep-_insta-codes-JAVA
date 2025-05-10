class pattern7{
    public static void main(String[] args) {
        int n  = 4;
        for(int i = 0; i<n; i++){
            
            for(int j =0; j<n+i; j++){
                
                if(j<i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                
            }
            System.out.println();
        }
    }

}