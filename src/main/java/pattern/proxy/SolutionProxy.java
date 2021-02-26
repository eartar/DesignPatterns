package pattern.proxy;

import lombok.RequiredArgsConstructor;

interface AccountService {
    void getAccountDetails();
}

class AccountServiceImpl implements AccountService{

    @Override
    public void getAccountDetails() {
        System.out.println("Emir Artar, İstanbul");
    }
}

@RequiredArgsConstructor
class AccountServiceImplProxy implements AccountService{

    AccountService accountServiceImpl;
    private final String accToken;

    @Override
    public void getAccountDetails() {
        if (isTokenValid()){
            //get account info from db
            if (accountServiceImpl == null)
                accountServiceImpl = new AccountServiceImpl();
            accountServiceImpl.getAccountDetails();
        }
        else{
            System.out.println("401 Unauthorized");
        }
    }

    private boolean isTokenValid(){
        //do fancy checks on redis to see if token is valid
        //if it fails return false
        return true;
    }
}


public class SolutionProxy {
    public static void main(String[] args) {
        AccountService accountService = new AccountServiceImplProxy("rAnDomToK3n11512h4h4");
        accountService.getAccountDetails();
    }
}
