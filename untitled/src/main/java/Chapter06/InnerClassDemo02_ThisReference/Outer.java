package Chapter06.InnerClassDemo02_ThisReference;

public class Outer {
    private String name;

    public Outer(String name) {
        this.name = name;
    }

    public Inner createInner(String name){
        return new Inner(name);
    }

    @Override
    public String toString() {
        return "Outer{" +
                "name='" + name + '\'' +
                '}';
    }

    public void showOuter(){
        System.out.println(this.getClass().getName());
        this.toString();
    }

    public class Inner{
        private String name;

        public Inner(String name) {
            this.name = name;
        }

        public void showInner(){
            System.out.println("内部类name：" + this.name +
                    "\n外部类name：" + Outer.this.name );
        }

        public void compareObject(){
            System.out.println("Inner对象：" + this.getClass().getName());
            System.out.println("Outer对象：" + Outer.this.getClass().getName());
            System.out.println("对比对象类型：" + ((Object) this == (Object) Outer.this));
        }
    }
}
