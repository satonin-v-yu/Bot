import org.telegram.telegrambots.ApiContext;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class Main {
    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();

        DefaultBotOptions options = ApiContext
                .getInstance(DefaultBotOptions.class);
//        options.setProxyHost("199.247.20.58");
//        options.setProxyPort(32124);
//        //Select proxy type: [HTTP|SOCKS4|SOCKS5] (default: NO_PROXY)
//        options.setProxyType(DefaultBotOptions.ProxyType.SOCKS5);

        try {
            //95.179.245.60:33086

            telegramBotsApi.registerBot(new Bot(options));
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
