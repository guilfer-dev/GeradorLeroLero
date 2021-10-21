class LeroLeroGenerator {

    randomPhraseFromList(phrase) {
        const rand = Math.floor(Math.random() * phrase.length);
        return phrase[rand];
    }

    generate() {

        const phaseOne = this.randomPhraseFromList(FirstPhrase);
        const phaseTwo = this.randomPhraseFromList(SecondPhrase);
        const phaseThree = this.randomPhraseFromList(ThirdPhrase);
        const phaseFour = this.randomPhraseFromList(FourthPhrase);

        return `${phaseOne} ${phaseTwo} ${phaseThree} ${phaseFour}`;
    }

    printGeneratedPhrase() {
        const finalPhrase = this.generate();
        document.getElementById('new-phrase').innerHTML = finalPhrase;
        return finalPhrase
    }

}