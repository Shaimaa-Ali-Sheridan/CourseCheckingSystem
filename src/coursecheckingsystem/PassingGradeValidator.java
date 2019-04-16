/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursecheckingsystem;

/**
 *
 * @author shaim
 */
public class PassingGradeValidator {
    
    public static boolean isPassingGrade(double percent)
    {
        if (percent >= 50)
            return true;
        else
            return false;
    }
    
}
