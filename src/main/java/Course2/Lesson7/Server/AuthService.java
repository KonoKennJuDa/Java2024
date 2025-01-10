package Course2.Lesson7.Server;

/**
 * Сервис аутентификации.
 */
public interface AuthService {

    /**
     * Запустить сервис.
     */
    void start();

    /**
     * Отключить сервис.
     */
    void stop();

    /**
     * Получить никнейм по логину и паролю
     * @param login
     * @param pass
     * @return никнейм, если найден или null, если такого нет
     */
    String getNickByLoginAndPass(String login, String pass);

}
