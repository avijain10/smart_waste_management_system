/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Avi
 */
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

@FacesValidator("contactValidator")

public class contactValidator implements Validator  {
    private static final String CONTACT_PATTERN = "(\\d{3})-(\\d{3})-(\\d{4})";
    
    private Pattern pattern;
    private Matcher matcher;
    
    public contactValidator(){
        pattern = Pattern.compile(CONTACT_PATTERN);
    }
    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        Matcher matcher = pattern.matcher(value.toString());
        if (!matcher.matches()){
            FacesMessage msg =  new FacesMessage("Contact Number validation failed", 
                      "Invalid Contact number.");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        
        }
    }
    
    
}

