package one.digitalinovation.gof.singleton;

import one.digitalinovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinovation.gof.strategy.ComportamentoNormal;
import one.digitalinovation.gof.facade.Facade;
import one.digitalinovation.gof.strategy.ComportamentoAgressivo;

import one.digitalinovation.gof.strategy.Robo;

public class Test {

    public static void main(String[] args) {

        // Testes relacionados ao Design pattern singleton:

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("Giovanna", "234567982");
    }
    }

