import ResultsDisplay from '@/components/ResultsDisplay.vue';
/* eslint-disable-next-line no-unused-vars */
import { shallowMount, Wrapper } from '@vue/test-utils';

import chai from 'chai';
chai.should();

describe('ResultsDisplay', () => {
  /** @type Wrapper */
  let wrapper;
  beforeEach( () => {
    wrapper = shallowMount(ResultsDisplay);
  });

  it('should display table of information from searchResult prop', () => {
    wrapper.setProps({
      'results': {
        'Results': [
          {
            'Make_ID': 0,
            'Make_Name': 'TEST',
            'Mfr_Name': 'MFRTEST'
          }
        ]
      }
    });

    let cells = wrapper.findAll('table tr td');
    cells.at(0).text().should.equal('0');
    cells.at(1).text().should.equal('TEST');
    cells.at(2).text().should.equal('MFRTEST');
  });
});