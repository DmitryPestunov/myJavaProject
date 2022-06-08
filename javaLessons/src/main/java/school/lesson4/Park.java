package school.lesson4;

import java.util.ArrayList;

public class Park {

    ArrayList <Attraction> attractionList = new ArrayList();

    public void attraction(String name, String workTime, int cost){
        Attraction atr = new Attraction(name, workTime, cost);
        attractionList.add(atr);
    }

    public void showAttractionList () {
        for (Attraction a : attractionList){
            System.out.println(a);
        }
    }

    public class Attraction {
        private String name;
        private String workTime;
        private int cost;

        public Attraction(String name, String workTime, int cost) {
            this.name = name;
            this.workTime = workTime;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getWorkTime() {
            return workTime;
        }

        public void setWorkTime(String workTime) {
            this.workTime = workTime;
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", workTime='" + workTime + '\'' +
                    ", cost=" + cost +
                    '}';
        }
    }
}
