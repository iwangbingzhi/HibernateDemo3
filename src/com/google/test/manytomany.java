package com.google.test;

import com.google.manytomany.Role;
import com.google.manytomany.User;
import com.google.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Created by 王炳智 on 2017/9/25.
 */
public class manytomany {
    public static void main(String[] args) {
        testTable2();
    }
    //演示维护第三张表
    public static void testTable2(){
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        try{
            sessionFactory = HibernateUtils.getSessionFactory();
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            //让某个用户没有某个角色
            User user = session.get(User.class,3);
            Role engnieer = session.get(Role.class,4);
            //从用户里面把角色去掉
            user.getSetRole().remove(engnieer);

            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
        }finally {
            session.close();
            sessionFactory.close();
        }
    }

    public static void testTable(){
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        try{
            sessionFactory = HibernateUtils.getSessionFactory();
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            //让某个用户具有某个角色 让王炳智有工程师角色
            User wbz = session.get(User.class,3);
            Role engnieer = session.get(Role.class,4);
            wbz.getSetRole().add(engnieer);
            session.save(wbz);




            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
        }finally {
            session.close();
            sessionFactory.close();
        }
    }



    //多对多级联保存(简便写法)
    public static void testadddemo(){
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        try{
            sessionFactory = HibernateUtils.getSessionFactory();
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            User user1 = new User();
            user1.setUser_name("wangbingzhi");
            user1.setUser_password("66666");

            User user2 = new User();
            user2.setUser_name("wanglihong");
            user2.setUser_password("123");

            Role role1 = new Role();
            role1.setRole_name("总经理");
            role1.setRole_memo("总经理");

            Role role2 = new Role();
            role2.setRole_name("董事长");
            role2.setRole_memo("董事长");

            Role role3 = new Role();
            role3.setRole_name("秘书");
            role3.setRole_memo("秘书");

            Role role4 = new Role();
            role4.setRole_name("工程师");
            role4.setRole_memo("工程师");

            //建立两者之间的关系 user1---r1/r2 user2---r2/r3
            user1.getSetRole().add(role1);
            user1.getSetRole().add(role2);

            user2.getSetRole().add(role2);
            user2.getSetRole().add(role3);

            session.save(user1);
            session.save(user2);

            transaction.commit();

        }catch (Exception e){
            transaction.rollback();
        }finally {
            session.close();
            sessionFactory.close();
        }
    }


    //多对多级联删除
    public static void testdeletedemo(){
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        try{
            sessionFactory = HibernateUtils.getSessionFactory();
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            User user = session.get(User.class,1);
            session.delete(user);

            transaction.commit();

        }catch (Exception e){
            transaction.rollback();
        }finally {
            session.close();
            sessionFactory.close();
        }
    }
}
