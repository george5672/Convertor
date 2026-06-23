package app;

public class DataHandler {



        public <T> String formatItems(T[] items) {
            StringBuilder sb = new StringBuilder();
            int count = 0;


            for (T item : items) {
                count++;

                sb.append(String.format("(%d) %s \n", count, item));
            }

            return count + " format item \n" + sb.toString();
        }
    }

