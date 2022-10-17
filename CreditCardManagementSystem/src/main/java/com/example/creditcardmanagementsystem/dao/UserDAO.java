package com.example.creditcardmanagementsystem.dao;



public class UserDAO {

    public boolean select(String username, String password) {
        return username.equals("admin") && password.equals("admin123");
    }

    public boolean insert() {

        User user = new User("Ken", "password2022", "", "", "", "");

        System.out.println(user);
//        this.persistSubscriber(user);

        System.out.println(user);

//        UserRepository repository = new UserRepository();
        return true;
    }


//    private void insertFourEmployees(UserRepository repository) {
//        repository.save(user);
//    }

//    private static final EntityManagerFactory emf =
//            Persistence.createEntityManagerFactory("default");

    public UserDAO() {
    }

//    public void persistSubscriber(User user) {
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//        em.persist(user);
//        em.getTransaction().commit();
//        em.close();
//    }

}
