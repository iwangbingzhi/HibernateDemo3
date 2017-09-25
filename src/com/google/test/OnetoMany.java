package com.google.test;

/**
 * Created by 王炳智 on 2017/9/23.
 */


/*
public class OnetoMany {
    public static void main(String[] args) {
        testupdate();
    }

    //一对多的修改操作
    public static void testupdate(){
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        try{
            sessionFactory = HibernateUtils.getSessionFactory();
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            //根据id查询cook联系人，根据Id查询客户
            Customer customer = session.get(Customer.class,3);
            LinkMan linkMan = session.get(LinkMan.class,2);

            //设置持久态对象值
            //把联系人放到客户里面 把客户放到联系人里面
            customer.getSetLinkMan().add(linkMan);
            linkMan.setCustomer(customer);

            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
        }finally {
            session.close();
            sessionFactory.close();
        }
    }

    //一对多的级联删除
    public static void testdelect(){
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        try{
            sessionFactory = HibernateUtils.getSessionFactory();
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            //1.添加一个客户，并且为这个客户添加一个联系人

            Customer customer = session.get(Customer.class,1);
            session.delete(customer);


            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
        }finally {
            session.close();
            sessionFactory.close();
        }
    }

    //一对多的级联保存的简单写法
    public static void testAdd2(){
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        try{
            sessionFactory = HibernateUtils.getSessionFactory();
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            //1.添加一个客户，并且为这个客户添加一个联系人
            Customer customer = new Customer();
            customer.setCustName("苹果");
            customer.setCustLevel("普通客户");
            customer.setCustMobile("6666");
            customer.setCustPhone("123");
            customer.setCustSource("互联网");

            LinkMan linkMan = new LinkMan();
            linkMan.setLkm_name("cook");
            linkMan.setLkm_gender("男");
            linkMan.setLkm_phone("6666666");

            customer.getSetLinkMan().add(linkMan);

            //3.保存到数据库
            session.save(customer);

            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
        }finally {
            session.close();
            sessionFactory.close();
        }
    }

    //复杂写法
    public static void testAdd(){
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        try{
            sessionFactory = HibernateUtils.getSessionFactory();
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            //1.添加一个客户，并且为这个客户添加一个联系人
            Customer customer = new Customer();
            customer.setCustName("谷歌");
            customer.setCustLevel("vip");
            customer.setCustMobile("6666");
            customer.setCustPhone("123");
            customer.setCustSource("互联网");

            LinkMan linkMan = new LinkMan();
            linkMan.setLkm_name("wang");
            linkMan.setLkm_gender("男");
            linkMan.setLkm_phone("88888888");

            //2.在客户表示联系人，在联系人表示客户  建立两者之间的关系
            //2.1把联系人对象放到客户的set集合里面
            customer.getSetLinkMan().add(linkMan);
            //2.2把客户对象放在联系人对象里面
            linkMan.setCustomer(customer);

            //3.保存到数据库
            session.save(customer);
            session.save(linkMan);

            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
        }finally {
            session.close();
            sessionFactory.close();
        }
    }
}
*/
