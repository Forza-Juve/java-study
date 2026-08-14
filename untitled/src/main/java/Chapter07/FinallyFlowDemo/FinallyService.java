package Chapter07.FinallyFlowDemo;

public class FinallyService {
    public void test(int type){
        if(type == 1) {
            try{
                System.out.println(type + "try开始");
                System.out.println("正常结束");
            } catch(Exception e) {

            } finally {
                System.out.println(type + "finally执行");
            }
        }

        if(type == 2) {
            try{
                System.out.println(type + "try开始");
                throw new RuntimeException("发生异常");
            } catch(Exception e) {
                System.out.println("处理异常");
            } finally {
                System.out.println(type + "finally执行");
            }
        }

        if(type == 3) {
            try{
                System.out.println(type + "try开始");
                throw new RuntimeException("发生异常");
            } finally {
                System.out.println(type + "finally执行");
            }
        }
    }
}
