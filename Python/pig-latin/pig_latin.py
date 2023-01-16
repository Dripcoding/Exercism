import re


def translate(text):
    return ' '.join([translate_one_word(w) for w in text.split(' ')])


def translate_one_word(text):
    vowel = re.search('^[aeiou]', text)
    vowel_yt = re.search('^yt', text)
    vowel_xr = re.search('^xr', text)
    consonant = re.search('^[^aeiou]+', text)
    consonant_qu = re.search('^[^aeiou]*(qu)+', text)
    consonant_y = re.search('^[^aeiou]+y', text)
    
    if vowel or vowel_yt or vowel_xr:
        return text + 'ay'
    elif consonant_qu:
        return text[consonant_qu.span()[1] : ] \
            + text[0 : consonant_qu.span()[1]] \
            + 'ay'
    elif consonant_y:
        return text[consonant_y.span()[1] - 1 : ] \
            + text[0 : consonant_y.span()[1] - 1] \
            + 'ay'
    elif consonant:       
        return text[consonant.span()[1] : ] \
            + text[0 : consonant.span()[1]] \
            + 'ay'