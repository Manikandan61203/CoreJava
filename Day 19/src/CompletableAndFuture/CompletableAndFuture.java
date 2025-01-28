package CompletableAndFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableAndFuture {
    public static void main(String[] args) {

        CompletableFuture<String> userData = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
                return "User Data : Mani ,21";
            } catch (InterruptedException e) {
                return "Error Fetching User Data";
            }
        });

        CompletableFuture<String> userOrder = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
                return "User Orders : Laptop, Mouse";
            } catch (InterruptedException e) {
                return "Error Fetching User Orders";
            }
        });

        CompletableFuture<String> combineData = userData.thenCombine(userOrder, (ud, uo) -> {
            return ud + "\n" + uo;
        });

        try {
            String res = combineData.get();
            System.out.println(res);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
