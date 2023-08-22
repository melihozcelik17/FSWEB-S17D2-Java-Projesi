package model;

import com.workintech.SpringBoot.mapping.DeveloperResponse;

public class DeveloperValidation {
    public static boolean isIdValid(int id){
      return id > 0;
        }
        public static boolean isDeveloperValid(Developer developer){
        return isIdValid(developer.getId()) &&
            developer.getName() != null && developer.getName().isEmpty() && developer.getSalary() > 25000;


    }
}
