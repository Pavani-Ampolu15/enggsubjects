class days{
    public static void main(String args[])
    {
        String str="monday";
        
        switch(str)
        {
            case "sunday" :System.out.println("it is the 1st day of a week");
            break;
            case "monday":System.out.println("it is a second day in a week");
            break;
            case "tuesday":System.out.println("it is the 3rd day of a week");
            break;
            case "wednesday":System.out.println("it is a 4th day in a week");
            break;
            case "thursday":System.out.println("it is the 5th day of a week");
            break;
            case "friday":System.out.println("it is a 6th day in a week");
            break;
            case "saturday":System.out.println("it is a 7th day in a week");
            break;
            default:System.out.println("");
            break;
        }
    }
}