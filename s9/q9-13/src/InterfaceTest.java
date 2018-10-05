interface Top {
    void top();
}

interface Mid1 extends Top {
    void mid1();
}

interface Mid2 extends Top {
    void mid1();
}

interface Bottom extends Mid1, Mid2 {
    void bottom();
}
//因为接口没有成员变量，所以不存在歧义，并且要求同名方法返回类型相同
public class InterfaceTest {
}
