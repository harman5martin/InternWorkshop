package src.src.ModelViewControllerExample;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;

public class CalculatorController implements CalculatorObserver, CalculatorViewListener {

    CalculatorModel model;
    CalculatorView view;

    boolean start_of_number;
    boolean point_pressed;
    Operation.OpType in_progress;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        view.addCalculatorViewListener(this);

        start_of_number = true;
        point_pressed = false;
        view.setDisplay("0");
        in_progress = Operation.OpType.SET;

        model.addObserver(this);
    }

    public void handleCalculatorViewEvent(CalculatorViewEvent e) {
        if (e.isDigitEvent()) {
            DigitEvent digit = (DigitEvent) e;

            if (start_of_number) {
                view.setDisplay(digit.getString());
                start_of_number = false;
            } else {
                if (view.getDisplay().equals("0")) {
                    if (digit.getValue() != 0) {
                        view.setDisplay(digit.getString());
                    }
                } else {
                    view.appendToDisplay(digit.getString());
                }
            }
        } else if (e.isOperationEvent()) {
            OperationEvent op_event = (OperationEvent) e;

            if (!start_of_number) {
                double display_value = Double.parseDouble(view.getDisplay());
                model.evaluate(new Operation(in_progress, display_value));
            }
            start_of_number = true;
            point_pressed = false;
            in_progress = op_event.getOpType();
            if (in_progress == Operation.OpType.SET) {
                model.evaluate(new Operation(in_progress, model.getValue()));
            }
        } else if (e.isInversionEvent()) {
            if (Double.parseDouble(view.getDisplay()) != 0) {
                String in_display = view.getDisplay();
                if (in_display.charAt(0) != '-') {
                    view.setDisplay("-" + in_display);
                } else {
                    view.setDisplay(in_display.substring(1));
                }
            }
        } else if (e.isPointEvent()) {
            if (start_of_number) {
                view.setDisplay("0.");
                start_of_number = false;
            } else if (!point_pressed) {
                view.appendToDisplay(".");
            }
            point_pressed = true;
        }
    }

    public void update(CalculatorModel calc, Operation operation) {
        view.appendToTape(operation.toString() + "\n");
        view.setDisplay(Double.toString(model.getValue()));
    }
}
