package br.com.dio;

import br.com.dio.ui.custom.screen.MainScreen;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class UIMain extends Application {

    private String[] args;

    @Override
    public void init() throws Exception {
        this.args = this.getParameters().getRaw().toArray(new String[0]);
        super.init();
    }

    @Override
    public void start(Stage stage) {
        if (this.args == null || this.args.length == 0) {
            System.err.println("Erro: Os argumentos de configuração do jogo não foram passados.");
            System.err.println("Por favor, adicione os argumentos na sua configuração do launch.json.");
            return;
        }

        final var gameConfig = Stream.of(this.args)
                .collect(toMap(k -> k.split(";")[0], v -> v.split(";")[1]));
                
        var mainScreen = new MainScreen(gameConfig);
        mainScreen.buildMainScreen();
    }

    public static void main(String[] args) {
        launch(args);
    }
}