const allPhrases = [FirstPhrase, SecondPhrase, ThirdPhrase, FourthPhrase]

class LeroLeroGenerator {

    randomPhraseFromList(phrase) {
        const rand = Math.floor(Math.random() * phrase.length);
        return phrase[rand];
    }

    generate() {

        const selectedPhrases = allPhrases.map(phrase => this.randomPhraseFromList(phrase));
        const finalPhrase = `${selectedPhrases[0]} ${selectedPhrases[1]} ${selectedPhrases[2]} ${selectedPhrases[3]}`
        return finalPhrase;
    }

    printGeneratedPhrase(HTMLId) {
        const finalPhrase = this.generate();
        document.getElementById(HTMLId).innerHTML = finalPhrase;
        return finalPhrase
    }

}
