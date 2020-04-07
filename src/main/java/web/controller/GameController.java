package web.controller;

import bean.api.ServiceTable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {
    ServiceTable serviceTable;

    public GameController(ServiceTable serviceTable) {
        this.serviceTable = serviceTable;
    }

    @GetMapping(path = "/")
    public String startGame() {
        return "index";
    }

    @GetMapping(path = "/table")
    public String drawTable(Model model) {
        String[][] array = serviceTable.getArray();
        model.addAttribute("array", array);
        return "table";
    }

    @PostMapping(path = "/action")
    public String showStep(@RequestParam Integer y, @RequestParam Integer x, Model model) {
        String[][] array = serviceTable.getArray();
        serviceTable.turnHuman(y, x);
        if (serviceTable.isTableFull()) {
            array = serviceTable.cleanArray();
            model.addAttribute("array", array);
            return "deadHeat";
        }
        if (serviceTable.isThereAWinner(serviceTable.getSignX())) {
            array = serviceTable.cleanArray();
            model.addAttribute("array", array);
            return "winnerUser";
        }
        serviceTable.turnComputer();
        if (serviceTable.isTableFull()) {
            array = serviceTable.cleanArray();
            model.addAttribute("array", array);
            return "deadHeat";
        }
        if (serviceTable.isThereAWinner(serviceTable.getSignO())) {
            array = serviceTable.cleanArray();
            model.addAttribute("array", array);
            return "winnerComputer";
        }
        model.addAttribute("array", array);
        return "redirect:/table";
    }
}
