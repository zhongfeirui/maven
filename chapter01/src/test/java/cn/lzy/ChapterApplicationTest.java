package cn.lzy;


import cn.lzy.controller.ChapterController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;

@RunWith(SpringRunner.class)//测试运行器，并加载spring boot 测试注解
@SpringBootTest//标记单元测试类，并加载项目的上下文环境ApplicationContest
public class ChapterApplicationTest {
        @Autowired//Autowired注入ChapterController类
         ChapterController chapterController;
        @Test
         public void unitTest(){
            String result = chapterController.sayHello();
            System.out.println("单元测试返回"+result);
        }
}