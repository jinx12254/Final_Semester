package Functions.Add;
import Functions.Add.Behaviours.AddPerson;
import Functions.Add.Behaviours.AddStudent;
import Functions.Add.Behaviours.AddTeacher;
import Functions.Add.Behaviours.AddWorker;

public abstract class Directional {
   //Action listener on select type of person need to add
   public AddPerson add(String type){
      switch (type){
         case "student":
            return new AddStudent();
         case "teacher":
            return new AddTeacher();
         case "worker":
            return new AddWorker();
      }
      return null;
   }
}
