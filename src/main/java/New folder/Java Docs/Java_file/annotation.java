class KeyPadPhone{
    @Deprecated
    void sendMessage(){
        System.out.println("Text message sent!");
    }
}

class AndroidPhone extends KeyPadPhone{
    @Override
    void sendMessage(){
        System.out.println("Message sent via WhatsApp!");
    }
}

public class annotation{
        public static void main(String args[]){
            @SuppressWarnings("deprecation")
            AndroidPhone Samsung = new AndroidPhone();
            Samsung.sendMessage();
}
}
