public class DBInstance {
    private volatile static DBInstance con;

        private DBInstance() {

        }

        public synchronized static  DBInstance getInstance() {

            synchronized (DBInstance.class){
                if(con==null){
                    return new DBInstance();
                }
            }
            return con;
        }

}


