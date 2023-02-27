package com.julio.app.pooabstractclass.form.elements;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementForm {
    private List<Option> options;


    public SelectForm(String name) {
        super(name);
        this.options = new ArrayList<Option>();
    }

    public SelectForm(String name, List<Option> options) {
        super(name);
        this.options = options;
    }

    public SelectForm addOptions(Option option) {
        this.options.add(option);
        return this;
    }

    @Override
    public String drawHtml() {
        StringBuilder stringBuilder = new StringBuilder("<select ");
        stringBuilder.append("name='")
                .append(this.name)
                .append("'>");

        for (Option option:this.options) {
            stringBuilder.append("\n<option name='")
                    .append(option.name)
                    .append("' value= '")
                    .append(option.value);
                    if(option.isSelected()){
                        stringBuilder.append(" selected");
                        this.value = option.value;
                    }

                    stringBuilder.append("'>")
                    .append(option.name)
                    .append("</option>");
        }
        stringBuilder.append("\n</select>");
        return stringBuilder.toString();
    }
}
