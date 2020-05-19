/**
 * Author: dts
 * DateTime: 2020/5/5 1:10
 * Description: TODO
 */
        class B {
            public int Func() {
                System.out.print("B");
                return 0;
            }
        }
        class D extends B {
            @Override
            public int Func() {
                System.out.print("D");
                return 0;
            }
        }
        public class TestDemo {
            public static void main(String[] args) {
                B a = new B();
                B b = new D();
                a.Func();
                b.Func();
            }
        }

