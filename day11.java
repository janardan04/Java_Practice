class day11{
    public static void main(String[] args) {
    String []str={"Alex", "Jacob", "Mark", "Max"};
        if(str.length == 0){
            System.out.println("no one likes this");
        }
        else if(str.length==1){
            System.out.println(str[0]+" Peter likes this");
        }
        else if(str.length==2){
            System.out.println(str[0]+" and "+str[1]+" like this");
        }
        else if(str.length==3){
            System.out.println(str[0]+", "+str[1]+" and "+str[2]+" like this");

        }
        else{
            System.out.println(str[0]+", "+str[1]+" and "+(str.length-2)+" others like this");

        }

    System.out.println(str.length);
    }
}