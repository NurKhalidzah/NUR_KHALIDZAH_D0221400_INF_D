static Scanner sc = new Scanner(System.in);
static int B = sc.nextInt();
static int H = sc.nextInt();
static boolean flag = true;

static{
    try{
        if(B<=0){
            flag = false;
            throw new Exception("Breadth and height must be positive");
        }
    }catch(Exception ex){
        System.out.println(ex); 
    }
}
