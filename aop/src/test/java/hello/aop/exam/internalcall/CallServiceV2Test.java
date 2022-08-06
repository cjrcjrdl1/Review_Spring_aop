package hello.aop.exam.internalcall;

import hello.aop.internalcall.CallLogAspect;
import hello.aop.internalcall.CallServiceV1;
import hello.aop.internalcall.CallServiceV2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(CallLogAspect.class)
@SpringBootTest
public class CallServiceV2Test {

    @Autowired
    CallServiceV2 callServiceV2;

    @Test
    void external() {
        callServiceV2.external();
    }

}
