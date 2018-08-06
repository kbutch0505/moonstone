package nickel.moonstone;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) throws Exception {
        // 認証対象外を設定
        web.ignoring().antMatchers(
                            "/assets/**",
                            "/css/**",
                            "/webjars/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            // ログイン認証を行うパスを設定
            .authorizeRequests()
                .antMatchers("/", "/test").permitAll()   // ルートは全ユーザがアクセス可能
                .anyRequest().authenticated()   // 他のURLは認証が必要
                .and()
            // フォーム認証を有効化
            .formLogin()
                .loginPage("/login")            // ログイン画面のURL
                .permitAll()                    // 全ユーザのアクセスを許可する
                .defaultSuccessUrl("/home", true)       // ログインが成功したときのURL
                .and()
            // ログアウト
            .logout()
                .logoutSuccessUrl("/")     // ログアウト画面のURL
                .permitAll();
    }

    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        UserDetails user =
             User.withDefaultPasswordEncoder()
                .username("user@com")
                .password("userp@com")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(user);
    }

}