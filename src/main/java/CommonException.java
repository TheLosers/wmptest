public class CommonException extends Throwable {

    private  String msg;

    public CommonException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

}
