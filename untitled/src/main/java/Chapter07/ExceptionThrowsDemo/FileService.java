package Chapter07.ExceptionThrowsDemo;

public class FileService {
    public void readConfig(String fileName) throws Exception{
        if("成功".equals(fileName)){
            System.out.println("开始读取配置\n" +
                    "配置读取成功");
        }else {
            throw new Exception("配置文件读取失败: " + fileName);
        }
    }
}
