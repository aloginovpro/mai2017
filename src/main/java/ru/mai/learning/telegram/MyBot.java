package ru.mai.learning.telegram;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import java.util.Map;

public class MyBot extends TelegramLongPollingBot {

    private final FxRateService service = new FxRateService();

    public void onUpdateReceived(Update update) {
        String cur = update.getMessage().getText();
        Long chatId = update.getMessage().getChatId();
        service.load().whenComplete((currencies, t) -> {
            String text = createResponseText(cur, currencies, t);
            SendMessage response = new SendMessage(chatId, text);
            try {
                execute(response);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private String createResponseText(String cur, Map<String, Double> currencies, Throwable t) {
        if (t != null) {
            return "Internal error";
        }
        Double fxRate = currencies.get(cur);
        if (fxRate == null) {
            return "Currency not found: " + cur;
        }
        return String.format("1 %s = %s rub", cur, fxRate);
    }

    public String getBotUsername() {
        return "testttt";
    }

    @Override
    public String getBotToken() {
        return "514689368:AAEL7-Jm8c9EHkFrArCXr7rxRp_6_iRIfAI"; //@BotFather
    }
}
