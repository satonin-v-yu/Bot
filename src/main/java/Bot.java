import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {

    public Bot(DefaultBotOptions options) {
        super(options);
    }

    @Override
    public void onUpdateReceived(Update update) {
        
    }
    @Override
    public String getBotUsername() {
        return "myEmployeeAssistantBot";
    }
    @Override
    public String getBotToken() {
        return "855030767:AAFMGSIt-m4bXj-_QKHJz0p7shByhUKtJP8";
    }
}
