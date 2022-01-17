package org.demo.paquete;

//import org.demo.A;

public class B {
    B b = new B(); // 1 -> ok, la misma clase
    C c1 = new C(); // 2 -> ok, el mismo paquete que B
    C c2 = new org.demo.paquete.C(); // 3 -> ok, el mismo paquete que B
    //paquete.C c3 = new org.demo.paquete.C(); // 4 no ok, no está bien referenciado
    org.demo.A a = new org.demo.A(); // 5 -> ok , A pública y ponemos el nombre completo
    //A a1 = new A(); // 6 -> no ok, aunque es pública, o bien tendríamos que importarla o bien el nombre completo
}
