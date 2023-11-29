package usecases;
import models.*;

public class Iphone implements Browser, Call, Player {
  
@Override
  public void startVoiceMail() {
    System.out.println("Start Voice Mail");
    
  }
  @Override
  public void answer() {
    System.out.println("Answer");
    
  }

  @Override
  public void call() {
    System.out.println("Call");
    
  }

  @Override
  public void pause() {
    System.out.println("Pause");
    
  }

  @Override
  public void play() {
    System.out.println("Play");
    
  }

  @Override
  public void addNewTab() {
    System.out.println("Add New Tab");
    
  }

  @Override
  public void reloadPage() {
    System.out.println("Reload Page");
    
  }

  @Override
  public void viewPage() {
    System.out.println("View Page");
    
  }


}
