class array7{
    public static void main(String[] args) {
        String [] name  = {"harithaa", "harini", "arun", "aathavan"};
        int i ;
        for( i = name.length -1; i >=0; i--){
            System.out.println(name[i]);
           
        }
        
        if(name == name){
                System.out.println("palindrome");
           } else {
            System.out.println("not palindrome");
            }
    }
}

