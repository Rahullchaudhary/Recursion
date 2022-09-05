public class InviteGuest {
    public static int inviteGuest(int n){
        if(n<=1){
            return 1;
        }
        //single
        int single=inviteGuest(n-1);
        //group
        int group=(n-1)*inviteGuest(n-2);
        return single+group;
    }
    public static void main(String[] args) {
        int n=2;
        System.out.println(inviteGuest(n));
    }
}
